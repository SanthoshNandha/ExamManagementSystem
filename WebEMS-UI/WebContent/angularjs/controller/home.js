var myApp = angular.module('myApp',['ngCookies']);
myApp.controller('mainctrl',['$scope', '$cookies', '$cookieStore', '$window', '$http',function($scope, $cookies, $cookieStore, $window, $http) {
	$scope.userType = $cookieStore.get("userType");
	$scope.userId = $cookieStore.get("userId");
	$scope.exams=[];
	$scope.selectedExamId;
	if($scope.userType == "faculty"){
		$scope.UserDisplay = true;
		$scope.CourseDisplay = true;
		$scope.QuestionDisplay = false;
		$scope.ExamDisplay = false;
		$scope.viewExamDisplay = true;
		$scope.testDisplay = true;
	}
	else if($scope.userType == "admin"){
		$scope.UserDisplay = false;
		$scope.CourseDisplay = false;
		$scope.QuestionDisplay = false;
		$scope.ExamDisplay = false;
		$scope.viewExamDisplay = true;
		$scope.testDisplay = false;
	}
	else{
		$scope.UserDisplay = true;
		$scope.CourseDisplay = true;
		$scope.QuestionDisplay = true;
		$scope.ExamDisplay = true;
		$scope.viewExamDisplay = false;
		$scope.testDisplay = true;
	}
	$scope.loadExamId = function(){
		$scope.userService = "http://localhost:9000/getExamsbyUserId?userId="+$scope.userId;
		$http.get($scope.userService)
		.success(function(data){
			$scope.exams = data;
		})
		.error(function(data){
			$scope.exams = [];
			$scope.examLoadResult = "Exam Load Failed !";
		});
	};
	
	$scope.startTest = function(){
		$cookieStore.put("examId", $scope.selectedExamId );
		$window.location.href = 'takeTest.html';
	};
	$scope.logout = function(){
		$cookieStore.remove("userType");
		$cookieStore.remove("userId");
		$cookieStore.remove("examId");
		$window.location.href = 'login.html';
	};
	
}]);