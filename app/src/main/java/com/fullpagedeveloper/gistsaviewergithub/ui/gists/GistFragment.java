package com.fullpagedeveloper.gistsaviewergithub.ui.gists;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fullpagedeveloper.gistsaviewergithub.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GistFragment extends Fragment {


	public GistFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_gist, container, false);
	}

}
