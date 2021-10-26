var app = angular.module("taskApp", ['ngResource','ngRoute']);

app.config(function($routeProvider) {
	  $routeProvider
	  .when("/", {
	    templateUrl : "index.htm",
	   // controller : "EmployeeController" 	
	  })
	  .when("/tasks", {
	    templateUrl : "tasks.htm",
	   // controller : "TaskController" 
	  })
	  .when("/project", {
	    templateUrl : "project.htm",
	   // controller : "ProjectController" 
	  })
	  .when("/userTask", {
	    templateUrl : "usertask.htm",
	  //  controller : "usertaskController" 
	  });
	});
