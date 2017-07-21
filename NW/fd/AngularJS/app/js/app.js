var mainApp = angular.module("mainApp", ["ngRoute", "customService", "tm.pagination"]);

mainApp.config(function($routeProvider, $locationProvider){

	//$locationProvider.html5Mode(true);

	$routeProvider.when("/student", {
		templateUrl: "/student/student.html"
	})
	.when("/detail/:id", {
		templateUrl: "/student/student_article.html"
	})
	.when("/personalInfo", {
		templateUrl: "/student/student_personal.html"
	})
	.when("/teacher", {
		templateUrl: "/teacher/teacher.html"
	})
	.when("/tpersonalInfo", {
		templateUrl: "/teacher/teacher_personal.html"
	})
	.when("/applyDetail/:id", {
		templateUrl: "/teacher/applyDetail.html"
	})
	.when("/applyTable/:id", {
		templateUrl: "/boss/applyTable.html"
	})
	.when("/boss", {
		templateUrl: "/boss/boss.html"
	})
	.when("/alterAct/:id", {
		templateUrl: "/boss/alterAct.html"
	})
	.when("/createTask", {
		templateUrl: "/boss/boss_article.html"
	})
	.when("/assignTask/:id", {
		templateUrl: "/boss/assignTask.html"
	})
	.when("/myTask", {
		templateUrl: "/boss/taskDetail.html"
	})
	.when("/altTask/:id", {
		templateUrl: "/boss/altTask.html"
	})
	.when("/bpersonalInfo", {
		templateUrl: "/boss/boss_personal.html"
	})
	.otherwise({
		templateUrl: "/login.html",
		resolve: {
			data: function(){
				sessionStorage.removeItem("user");
				sessionStorage.removeItem("activities");
				sessionStorage.removeItem("tasks");
				sessionStorage.removeItem("informs");
			}
		}
	});
});
