angular.module("testResultModule", ['ngCookies'])
  .controller("testResultController", ['$scope', '$cookies', '$cookieStore', '$window','$http', function($scope, $cookies, $cookieStore, $window, $http)
  {
	  $scope.testScore = $cookieStore.get("testScore");
	
  }]);
