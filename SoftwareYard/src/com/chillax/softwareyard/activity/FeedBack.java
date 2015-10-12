package com.chillax.softwareyard.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.chillax.softwareyard.R;
import com.chillax.softwareyard.customview.TopBar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.text.SimpleDateFormat;

/**
 * 反馈界面和图灵机器人界面雷同，这里直接使用图灵机器人的界面
 * Created by Chillax on 2015/8/8.
 */
@EActivity(R.layout.tuling_layout)
public class FeedBack extends BaseActivity implements TopBar.onTopClickedListener {
//    private MyAdapter adapter;
    private SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");

    @ViewById(R.id.topbar)
    TopBar topBar;

    @ViewById(R.id.tuling_listview)
    ListView lv;

    @ViewById(R.id.tuling_et)
    EditText et;
    @Click
    void tuling_tv(){
//        if(TextUtils.isEmpty(et.getText())){
//            Toast.makeText(this,"不能发送空反馈",Toast.LENGTH_SHORT).show();
//        }else {
//            conver.addUserReply(et.getText().toString());
//            et.setText("");
//            adapter.notifyDataSetChanged();
//            lv.setSelection(conver.getReplyList().size() - 1);
//        }
    }
    @AfterViews
    void init() {
//        topBar.setTopListener(this);
//        conver= new FeedbackAgent(this).getDefaultConversation();
//        adapter = new MyAdapter();
//        lv.setAdapter(adapter);
//        lv.setSelection(conver.getReplyList().size()-1);
//        sync();
    }

    @Override
    public void onBack(View view) {
        onBackPressed();
    }

    @Override
    public void onMore(View view) {

    }

    @Override
    public void onInit(ImageView back, TextView title, ImageView moreIv, TextView moreTv) {
        title.setText("用户反馈");
    }

//    private class MyAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return conver.getReplyList().size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            Reply reply = conver.getReplyList().get(position);
//            ViewHolder holder = ViewHolder.get(FeedBack.this, convertView, R.layout.tuling_list_item, position, null);
//            switch (reply.type) {
//                case Reply.TYPE_DEV_REPLY:
//                    holder.setVisibility(R.id.left,View.VISIBLE).setVisibility(R.id.right, View.GONE).setText(R.id.left_text, reply.content).setText(R.id.top_time, df.format(new Date()));
//                    break;
//                default:
//                    holder.setVisibility(R.id.left, View.GONE).setVisibility(R.id.right, View.VISIBLE).setText(R.id.right_text, reply.content).setText(R.id.top_time, df.format(new Date()));
//                    if(SelfFragment.userImageBitmap!=null){
//                        holder.setImageBitmap(R.id.right_image,SelfFragment.userImageBitmap);
//                    }
//                    break;
//            }
//            return holder.getConvertView();
//        }
//    }
//    private void sync(){
//        conver.sync(new SyncListener() {
//            @Override
//            public void onReceiveDevReply(List<Reply> list) {
//                adapter.notifyDataSetChanged();
//                lv.setSelection(conver.getReplyList().size() - 1);
//            }
//
//            @Override
//            public void onSendUserReply(List<Reply> list) {
//
//            }
//        });
//    }
    @Override
    protected void onResume() {
//        adapter.notifyDataSetChanged();
        super.onResume();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_clam, R.anim.slide_out_right);
    }
}
