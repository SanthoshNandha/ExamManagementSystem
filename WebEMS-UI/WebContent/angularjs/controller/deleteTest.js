angular.module("deleteTestModule", [])
  .controller("deleteTestController", ['$scope', '$http',function ($scope, $http){
	  $scope.testId;
	  $scope.deleteResult;
	  $scope.deleteTest = function(){
		  $http.get("http://localhost:9000/deleteTest?TestId="+$scope.testId)
		  .success(function(data){
			  $scope.result = data;
			  $scope.deleteResult = "Question Deleted Successfully !";
		  })
		  .error(function(data){
			  $scope.deleteResult = "ERROR !";
		  });
	  };
  }]);
