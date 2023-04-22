package org.swm.mammamia.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.swm.mammamia.R;
import org.swm.mammamia.ui.adapter.MeetingAdapter;
import org.swm.mammamia.ui.adapter.StationAdapter;
import org.swm.mammamia.ui.adapter.WritingAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Spinner stationSpinner = view.findViewById(R.id.spn_station);
        RecyclerView meetingRv = view.findViewById(R.id.rv_meeting);
        RecyclerView writingRv = view.findViewById(R.id.rv_writing);

        // stationSpinner
        List<String> stations = Arrays.asList(getResources().getStringArray(R.array.stations));
        StationAdapter adapter = new StationAdapter(getContext(), stations);
        stationSpinner.setAdapter(adapter);

        // meetingRv
        meetingRv.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        List<String> meetings = new ArrayList<>();
        meetings.add("모임");
        meetings.add("키즈카페\n후기 공유방");
        meetings.add("유아식 레시피\n공유 모임");
        meetings.add("소마 유모차\n레이싱 카페");
        MeetingAdapter meetingAdapter = new MeetingAdapter(meetings);
        meetingRv.setAdapter(meetingAdapter);

        // writingRv
        writingRv.setLayoutManager(new LinearLayoutManager(getContext()));
        List<WritingItem> writings = new ArrayList<>();
        writings.add(new WritingItem("우리 아이 이유식 레시피 공유해요!", "육아", "정보 공유"));
        writings.add(new WritingItem("아남타워 17층 키즈카페 어떤가요?", "놀이", "정보 공유"));
        writings.add(new WritingItem("36 워킹맘 고민이 있어요..", "육아", "고민"));
        WritingAdapter writingAdapter = new WritingAdapter(writings);
        writingRv.setAdapter(writingAdapter);
    }
}