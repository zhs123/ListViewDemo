package costomview.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.EditText;

import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import asder.MyAsder;
import bean.Bean;
import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
/**
*1.类的用途
*2.zhanghaisheng
*3.2017/11/13
**/
public class Main2Activity extends AppCompatActivity {
    private String url="http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=0&qtime=1";
    private Bean bean;
    private XRecyclerView xrecyclerview;
    private List<Bean.ResultBean.RowsBean> namelist;
    private MyAsder myasder;
    private int qtime=1;
    private List<Bean.ResultBean.RowsBean> list=new ArrayList<>();
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                String data = (String) msg.obj;
                Gson gson=new Gson();
                bean=gson.fromJson(data,Bean.class);
                setData(bean);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initData(url);
    }

    private void initData(String url) {
        OkHttpUtils.get(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String str=response.body().string();
                handler.obtainMessage(0,str).sendToTarget();
            }
        });
    }

    private void initView() {
        EditText ed1 = (EditText) findViewById(R.id.ed1);
        EditText ed2 = (EditText) findViewById(R.id.ed2);
        Intent intent = getIntent();
        String username = intent.getStringExtra("account").toString().trim();
        String userpwd = intent.getStringExtra("password").toString().trim();
        ed1.setText(username);
        ed2.setText(userpwd);

        xrecyclerview = (XRecyclerView) findViewById(R.id.xrecyclerview);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        xrecyclerview.setLayoutManager(manager);
        xrecyclerview.setLoadingMoreEnabled(true);
        xrecyclerview.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                list.clear();
                url="http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=0&qtime=1";
                initData(url);
                xrecyclerview.refreshComplete();
                myasder.notifyDataSetChanged();
            }

            @Override
            public void onLoadMore() {
                qtime++;
                url="http://api.fang.anjuke.com/m/android/1.3/shouye/recInfosV3/?city_id=14&lat=40.04652&lng=116.306033&api_key=androidkey&sig=9317e9634b5fbc16078ab07abb6661c5&macid=45cd2478331b184ff0e15f29aaa89e3e&app=a-ajk&_pid=11738&o=PE-TL10-user+4.4.2+HuaweiPE-TL10+CHNC00B260+ota-rel-keys%2Crelease-keys&from=mobile&m=Android-PE-TL10&cv=9.5.1&cid=14&i=864601026706713&v=4.4.2&pm=b61&uuid=1848c59c-185d-48d9-b0e9-782016041109&_chat_id=0&qtime=1"+qtime;
                initData(url);
                xrecyclerview.loadMoreComplete();
                myasder.notifyDataSetChanged();
            }
        });

    }

    private void setData(Bean bean) {
        namelist=bean.getResult().getRows();
        list.addAll(namelist);
        if (myasder==null) {
            myasder = new MyAsder(list,Main2Activity.this);
            xrecyclerview.setAdapter(myasder);
        }

    }
}
