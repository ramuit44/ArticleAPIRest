/**
 * Created by Sriram
 */

angular.module('articleApp',['ui.router','ngResource','articleApp.controllers','articleApp.services']);

angular.module('articleApp').config(function($stateProvider,$httpProvider){
    $stateProvider.state('articles',{
        url:'/articles',
        templateUrl:'partials/articles.html',
        controller:'ArticleListController'
    }).state('viewArticle',{
       url:'/articles/:id/view',
       templateUrl:'partials/article-view.html',
       controller:'ArticleViewController'
    }).state('newArticle',{
        url:'/articles/new',
        templateUrl:'partials/article-add.html',
        controller:'ArticleCreateController'
    }).state('editArticle',{
        url:'/articles/:id/edit',
        templateUrl:'partials/article-edit.html',
        controller:'ArticleEditController'
    });
}).run(function($state){
   $state.go('articles');
});