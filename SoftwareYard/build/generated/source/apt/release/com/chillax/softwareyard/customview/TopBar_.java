//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.chillax.softwareyard.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.chillax.softwareyard.R.id;
import com.chillax.softwareyard.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class TopBar_
    extends TopBar
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public TopBar_(Context context) {
        super(context);
        init_();
    }

    public TopBar_(Context context, AttributeSet attrs) {
        super(context, attrs);
        init_();
    }

    public TopBar_(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init_();
    }

    public static TopBar build(Context context) {
        TopBar_ instance = new TopBar_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.topbar, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public static TopBar build(Context context, AttributeSet attrs) {
        TopBar_ instance = new TopBar_(context, attrs);
        instance.onFinishInflate();
        return instance;
    }

    public static TopBar build(Context context, AttributeSet attrs, int defStyle) {
        TopBar_ instance = new TopBar_(context, attrs, defStyle);
        instance.onFinishInflate();
        return instance;
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        titleTv = ((TextView) hasViews.findViewById(id.title));
        moreTv = ((TextView) hasViews.findViewById(id.moreTv));
        moreIv = ((ImageView) hasViews.findViewById(id.moreIv));
        backIv = ((ImageView) hasViews.findViewById(id.back));
        if (backIv!= null) {
            backIv.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    TopBar_.this.back(view);
                }

            }
            );
        }
        if (moreTv!= null) {
            moreTv.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    TopBar_.this.more(view);
                }

            }
            );
        }
        if (moreIv!= null) {
            moreIv.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    TopBar_.this.more(view);
                }

            }
            );
        }
    }

}
