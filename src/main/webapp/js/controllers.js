/**
 * Created by Sriram
 */
angular.module('articleApp.controllers',[]).controller('ArticleListController',function($scope,$state,popupService,$window,Article){

    $scope.articles=Article.query();

    $scope.deleteArticle=function(article){
        if(popupService.showPopup('Really delete this?')){
            article.$delete(function(){
                $window.location.href='';
            });
        }
    }

}).controller('ArticleViewController',function($scope,$stateParams,Article){

    $scope.article=Article.get({id:$stateParams.id});

}).controller('ArticleCreateController',function($scope,$state,$stateParams,Article){

    $scope.article=new Article();

    $scope.addArticle=function(){
        $scope.article.$save(function(){
            $state.go('articles');
        });
    }

}).controller('ArticleEditController',function($scope,$state,$stateParams,Article){

    $scope.updateArticle=function(){
        $scope.article.$update(function(){
            $state.go('articles');
        });
    };

    $scope.loadMovie=function(){
        $scope.article=Article.get({id:$stateParams.id});
    };

    $scope.loadMovie();
});