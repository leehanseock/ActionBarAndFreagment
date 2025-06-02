package kr.ac.kopo.actionbarandfreagment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyTabFragment extends androidx.fragment.app.Fragment {

    String tabName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data = getArguments();
        tabName = data.getString("tabName");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout baseLayout = new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        baseLayout.setLayoutParams(params);

        if (tabName.equals("2024 1st Semster"))
            baseLayout.setBackgroundColor(Color.rgb(232,206,194));
        if (tabName.equals("2024 WCRC"))
            baseLayout.setBackgroundColor(Color.rgb(217,229,255));
        if (tabName.equals("2025 AI EXPO"))
            baseLayout.setBackgroundColor(Color.rgb(206,251,201));
        return baseLayout;

//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}