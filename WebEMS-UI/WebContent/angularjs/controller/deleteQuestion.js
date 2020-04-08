angular.module("deleteQuestionModule", [])
  .controller("deleteQuestionController", ['$scope', '$http',function ($scope, $http){
	  $scope.questionId;
	  $scope.deleteResult;
	  $scope.deleteQuestion = function(){
		  $http.get("http://localhost:9000/deleteQuestion?questionId="+$scope.questionId)
		  .success(function(data){
			  $scope.result = data;
			  $scope.deleteResult = "Question Deleted Successfully !";
		  })
		  .error(function(data){
			  $scope.deleteResult = "ERROR !";
		  });
	  };
  }]);
