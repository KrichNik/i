'use strict';

var activiti = require('../../components/activiti');

exports.authenticate = function(req, res) {
	var user = req.body;
	var options = {
		path: '/identity/users/' + user.login
	};

	activiti.get(options, function(error, statusCode, result) {
		res.statusCode = statusCode;		
		res.send(result);
	});
}