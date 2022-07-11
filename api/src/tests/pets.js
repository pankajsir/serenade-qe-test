//  const request = require('supertest');
//  const should = require('chai').should();
//  const	expect = require('chai').expect;

// describe('A simple api endpoint!"', () => {
 
// 	describe ("GET / - all pets", () => {
// 		it("GET / - all pets", async => {
// 		  const result =  request('http://localhost:1080').get('/pets');
// 		  console.log(result.statusCode);
// 		  expect(result.statusCode).equal(200);
// 		});
//   });

// });


import request from "supertest";
import expect  from "chai";

const baseUrl = '127.0.0.1:1080/';

describe('Todos endpoint', () => {
	it('should return a 200 status code', async () => {
		const response = await request(baseUrl)
			.get('pets');
		console.log("response Pets.-: " + response.statusCode);
		//expect(response.statusCode).(200);
	});
})
