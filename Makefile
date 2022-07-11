# Makefile
COMPOSE_RUN_NODE = docker-compose run --rm node-build-server
COMPOSE_RUN_GATLING = docker-compose run --rm gatling

start-mock-server:
	docker-compose up mock-server

stop-mock-server:
	docker-compose stop mock-server

install-deps:
	$(COMPOSE_RUN_NODE) yarn install

upgrade-deps:
	$(COMPOSE_RUN_NODE) yarn upgrade

shell:
	$(COMPOSE_RUN_NODE) bash

cleanDocker:
	docker-compose down --remove-orphans

clean:
	$(COMPOSE_RUN_NODE) bash -c "rm -fr node_modules"
	$(COMPOSE_RUN_NODE) bash -c "rm -fr yarn.lock"
	$(COMPOSE_RUN_NODE) bash -c "rm -fr yarn-error.log"


#############################
## YOU MUST IMPLEMENT THIS ##
#############################
build:
	$(COMPOSE_RUN_NODE) npm install

#############################
## YOU MUST IMPLEMENT THIS ##
#############################
test:
	$(COMPOSE_RUN_NODE) yarn test

##################################
## TO RUN THE PERFORMANCE TESTS ##
##################################

perfTest:
	$(COMPOSE_RUN_GATLING)  docker-compose run -rd "Performance Tests"


