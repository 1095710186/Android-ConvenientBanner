package com.bigkoo.convenientbannerdemo;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.CBPageAdapter;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by Sai on 15/8/4.
 * 网络图片加载例子
 */
public class NetworkImageHolderView implements CBPageAdapter.Holder<String>{
    private ImageView imageView;
    @Override
    public View createView(Context context) {
        //你可以通过layout文件来创建，也可以像我一样用代码创建，不一定是Image，任何控件都可以进行翻页
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, String data) {
        imageView.setImageResource(R.drawable.ic_default_adimage);
        ImageLoader.getInstance().displayImage(data,imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击事件
                ImageLoader.getInstance().displayImage("http://www.5068.com/u/faceimg/20140725173411.jpg",imageView);
            }
        });
    }
}
