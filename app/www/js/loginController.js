angular.module('starter.login', [])

.controller('LoginCtrl',['$scope', '$ionicPopup', '$timeout', '$state',  '$data', function($scope, $ionicPopup, $timeout, $state, $data) {
      console.log('login-------------');  
      $scope.user = {};

      $scope.fnLogin = function(){
             $data.login("user", this.user).success(function(data){
                 if(data == null){
                     $scope.showErrorMesPopup("手机号或密码错误");
                 }else{
                     $scope.showSuccessMesPopup("正在登录请稍后");
                     console.log(data);
                     var user = JSON.stringify(data);
                     sessionStorage.setItem("user",user);
                 }
          });
        };

        $scope.showErrorMesPopup = function(title) {
            var myPopup = $ionicPopup.show({
                title: '<b>'+title+'</b>'
            });
            $timeout(function() {
                myPopup.close(); // 1秒后关闭
            }, 1000);
        };

        $scope.showSuccessMesPopup = function(title) {
            var myPopup = $ionicPopup.show({
                title: '<b>'+title+'</b>',
                template: '<p style="text-align: center"><ion-spinner icon="android" class="spinner-positive"></ion-spinner></p>'
            });
            $timeout(function() {
                myPopup.close(); // 2秒后关闭
                $state.go("tab.dash");
            }, 2000);
        };
}]);
