var myApp = angular.module('authenticationModule', ['ngCookies']);
myApp.controller('LoginController', ['$scope', '$cookies', '$cookieStore', '$window','$http', function($scope, $cookies, $cookieStore, $window, $http) {
$scope.credentials = {
			  'userId':"",
			  'password':""
		};
	  $scope.login = function() {
		    $http.post('http://localhost:9000/authenticate',$scope.credentials)
		        .success(function(data, status, headers, config) {
		        	if(data.authUserId != null){
		        		$cookieStore.put("userId",data.authUserId);
		        		$cookieStore.put("userType",data.authUserType);
			        	$window.location.href = 'home.html';
		        	}
		        	else{
			            $scope.loginResult = "Login Failed! Incorrect UserID or Password";
		        	}
		        	
		        })
		        .error(function(data, status, headers, config)
			            {	
			            $scope.loginResult = "Login Failed! ERROR in server please try after some time ";
			            });
		    $scope.newUser = {
		    		'userName':"",
					'password':""
				};
		};

}]);
 