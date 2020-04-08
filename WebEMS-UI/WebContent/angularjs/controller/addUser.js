angular.module("addNewUserModule", [])
  .controller("addNewUserController", ['$scope', '$http',function ($scope, $http)
  {
	  $scope.newUser = {
			  'firstName':"",
			  'lastName':"",
			  'middleName':"",
			  'sex':"",
			  'dateofBirth': new Date(),
			  'addressLineOne':"",
			  'addressLineTwo':"",
			  'city':"",
			  'state':"",
			  'country':"",
			  'zipCode':"",
			  'mobileNumber':"",
			  'emailId':"",
			  'userType':"",
			  'courseIds': []
		};
	  $scope.htmlpage="addUserForm.html";
	  $scope.courses = {};
	  $scope.userTypes = {};
	  
	  $scope.loadpage = function(){
		  $http.get('http://localhost:9000/getAllCourse')
		  .success(function(data){
			  $scope.courses = data;
		  })
		  .error(function(data){
			  $scope.courses = "course load failed"
		  });
		  $http.get('http://localhost:9000/getAllUserTypes')
		  .success(function(data){
			  $scope.userTypes = data;
		  })
		  .error(function(data){
			   $scope.userTypes = "User Type load failed";
		  })
	  };
	  $scope.submitNewUser =function() {
		    $http.post('http://localhost:9000/addNewUser',$scope.newUser).
		        success(function(data, status, headers, config) {
		        	$scope.submitUserResult = data;
		        	$scope.submitStatus = "User Added Successfully : userId is" + submitUserResult.userId;
		        	if($scope.submitUserResult.status == "Success"){
		        		$scope.submitStatus = "User Added Successfully : userId is";
		        	}
		        	else{
		        		$scope.submitStatus = "User Add failed!"
		        	}
		        })
		        .error(function(data, status, headers, config)
			            {
			              $scope.submitUserResult = "Error while submitting";
			              $scope.submitStatus = "User Add failed!"
			            });
		    $scope.newUser = {
					  'firstName':"",
					  'lastName':"",
					  'middleName':"",
					  'sex':"",
					  'dateofBirth': new Date(),
					  'addressLineOne':"",
					  'addressLineTwo':"",
					  'city':"",
					  'state':"",
					  'country':"",
					  'zipCode':"",
					  'mobileNumber':"",
					  'emailId':"",
					  'userType':"",
					  'courseIds': []
				};
		};
  }]);
