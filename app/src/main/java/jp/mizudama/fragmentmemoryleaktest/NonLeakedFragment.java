package jp.mizudama.fragmentmemoryleaktest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class NonLeakedFragment extends Fragment {

    private ImageView mImageView;

    public NonLeakedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leaked, container, false);
        mImageView = (ImageView) view.findViewById(R.id.imageView);
        return view;
    }

    @Override
    public void onDestroyView() {
        mImageView = null;
        super.onDestroyView();
    }
}
