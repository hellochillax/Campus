//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.chillax.softwareyard.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.chillax.softwareyard.R.layout;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SelfFragment_
    extends com.chillax.softwareyard.fragment.SelfFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.self_fragment, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static SelfFragment_.FragmentBuilder_ builder() {
        return new SelfFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        listView = ((ListView) hasViews.findViewById(com.chillax.softwareyard.R.id.self_list));
        userImageView = ((ImageView) hasViews.findViewById(com.chillax.softwareyard.R.id.userImage));
        userLayout = ((RelativeLayout) hasViews.findViewById(com.chillax.softwareyard.R.id.user_layout));
        if (userImageView!= null) {
            userImageView.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    SelfFragment_.this.userImage();
                }

            }
            );
        }
        inits();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<SelfFragment_.FragmentBuilder_, com.chillax.softwareyard.fragment.SelfFragment>
    {


        @Override
        public com.chillax.softwareyard.fragment.SelfFragment build() {
            SelfFragment_ fragment_ = new SelfFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
