angular.module("deleteExamModule", [])
  .controller("deleteExamController", ['$scope', '$http',function ($scope, $http){
	  $scope.examId;
	  $scope.deleteResult;
	  $scope.deleteExam = function(){
		  $http.get("http://localhost:9000/deleteExam?examId="+$scope.examId)
		  .success(function(data){
			  $scope.result = data;
			  $scope.deleteResult = "Exam Deleted Successfully !";
		  })
		  .error(function(data){
			  $scope.deleteResult = "ERROR !";
		  });
	  };
  }]);
