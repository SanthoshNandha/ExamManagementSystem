angular.module("takeTestModule", ['ngCookies'])
  .controller("takeTestController", ['$scope', '$cookies', '$cookieStore', '$window','$http', function($scope, $cookies, $cookieStore, $window, $http)
  {
	  $scope.examId = $cookieStore.get("examId");
	  $scope.answerIndex = 0;
	  $scope.Examquestions = [];
	  $scope.test = {}
	  
	$scope.StudentAnswers = [];
	$scope.loadQuestions = function(){
		$scope.parameters = {
				  'examId' : $scope.examId,
	       };
	       $scope.config = {
	                'params': $scope.parameters
	       };
		$http.get('http://localhost:9000/getQuestionsbyExamId',$scope.config)
		.success(function(data){
			$scope.Examquestions = data;
		})
		.error(function(data){
			$scope.Examquestions = [];
		});
	};
	$scope.submitStudentAnswers = function(submitTestResult){
		angular.forEach($scope.Examquestions, function(exam) {
			$scope.studentAnswer = {
					'questionId' : exam.questionId,
					'questionNo' : exam.questionNo,
					'answeredChoice' : exam.answeredChoice
			};
			$scope.StudentAnswers.push($scope.studentAnswer);
			});
			$scope.test = {
					'userId' : $cookieStore.get("userId"),
					'examId' : $scope.examId,
					'studentAnswers' : $scope.StudentAnswers
			};
		$http.post('http://localhost:9000/submitAnswers',$scope.test)
		.success(function(data, status, headers, config){
			$scope.submittestResult = data;
			$cookieStore.put("testScore", $scope.submittestResult.testScore );
			$window.location.href = 'testResult.html';
			
		})
		.error(function(data, status, headers, config){
			$scope.submittestResult = "failed to submit";
			$window.alert("Submit Failed ! Please try again !");
		});
	};
  }]);
