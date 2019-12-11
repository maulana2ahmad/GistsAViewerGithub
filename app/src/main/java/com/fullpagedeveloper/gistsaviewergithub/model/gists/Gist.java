package com.fullpagedeveloper.gistsaviewergithub.model.gists;

import com.fullpagedeveloper.gistsaviewergithub.model.GithubUser;

import java.util.Date;
import java.util.Map;

public class Gist {

	/*
	Modified sample data from: https://developer.github.com/v3/gists/#list-a-users-gists
	{
		 "id": "aa5a315d61ae9438b18d",
		 	"files": {
      			"hello_world.rb": {
      			}
      		},

      	"created_at": "2010-04-14T02:15:15Z",
    	"updated_at": "2011-06-20T11:34:15Z",
    	"owner": {

    	}
	}
	*/

	private int id;
	private Map<String, GistFile> filses;
	private Date created_at;
	private Date updated_at;
	private GithubUser owner;
}
