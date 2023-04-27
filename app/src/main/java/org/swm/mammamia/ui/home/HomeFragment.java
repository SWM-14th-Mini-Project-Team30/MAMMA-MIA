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
        writings.add(new WritingItem("이거 위험한건가요?", "육아", "정보 공유", "아기침대 이불을 세탁중이라 오늘은 패밀리침대에 눕혀서 낮잠을 재웠는데 씨씨티비로 본다고 봣는데 보니까ㅜ애가 뒤집기를 해서 엎드려 있어서 막 뛰어 들어가봤더니 다행히 고개 돌려서 자고 있더라구요\n이런식으로 자다가 질식사 할수도 있는거죠?\n이제 5개월이라서 아기침대가 작아요 ㅠㅠ 패밀리침대에 재우는게 너무 불안해서 ... 다들 어떠신가요 \n이 자세 위험한거죠? 자다가 뒤집기 할줄은 ㅠㅠㅠ", R.drawable.detail_image1));
        writings.add(new WritingItem("애기 머리 쿵 했는데..괜찮을까요???", "놀이", "정보 공유", "제 부주의로 애기 머리가 쿵했는데..ㅠㅠㅠㅠ\n애를 안고제가 핸드폰을 들고 애 사진을 찍다가 폰이 떨어져서 다친거 같아요..\n근데 폰이 애 옆으로 떨어졌어서 정확히 폰에 맞은건지\n내 얼굴에 맞은건지는 모르겠어요ㅠㅠㅠㅠ\n너무 속상하네요 자책이되구요ㅠㅠ\n괜찮을까요..?ㅠㅠ순간적으로 애가 울고\n지금은 울지 않고 자고있긴한데\n초산맘이라 아무것도 모르고ㅠㅠ\n머리쪽이라 너무 걱정이되네요ㅠㅠ\n병원에 가보는게 좋을까요..?", R.drawable.detail_image2));
        writings.add(new WritingItem("뭘 발라줘야할까요ㅠ?", "육아", "고민", "신생아예요ㅠㅠ상처가 생긴거같은데\n비판텐 발라주면 될까요?? 점되진 않겟죠??", R.drawable.detail_image3));
        writings.add(new WritingItem("이런 모자 잘 쓸까용??", "육아", "정보 공유", "돌아깁니다\n뒤에 저렇게 목뒤까디 가려주는 모자.. 잘 쓸까요 ㅋㅋ\n캡모자는 있는데 조금 커서 딱맞는 모자를 하나 사고 싶어서요~ 안 불편해하나용??", R.drawable.detail_image4));
        writings.add(new WritingItem("8개월 서기지옥 \uD83E\uDD26", "놀이", "정보 공유", "언제끝날까요 \uD83E\uDD79\n스스로 앉는건 언제쯤 하나요,, 후,,\n지금은 기냥 뒤로 쾅 누워요 \uD83E\uDD72\n괜찮을까효,,", R.drawable.detail_image5));
        writings.add(new WritingItem("아기 발바닥 뭘까요..? 이게...", "육아", "고민", "저기 동그라미 친부분에 동글동글한게 만져져요 겉에서 볼땐 튀어나온게 없는데\n문뜩 어제 아기 발가락을 조물조물거리다가 알게됬어요! 발바닥 부분쪽이예요!\n오른쪽발에는 없고 왼쪽만 있더라구요...? 꼭 작은 구슬이 만져지는것같아요 \n아기는 안아파하는데 ㅠㅠ 뭘까요....? 저게 혹시 아시는 맘들 있나싶어서 올려봐요 \n내일 일단 감기때문에 소아과 재방문 날이라 가서 여쭤볼려고하는데\n정형외과를 가야하나요..? ㅠㅠ\n", R.drawable.detail_image6));
        writings.add(new WritingItem("트램펄린 이제품 어떤가요?", "육아", "정보 공유", "15갤 아이예요\n이제품 어떤가요~?\n", R.drawable.detail_image7));
        writings.add(new WritingItem("아기가 너무 많이 자요...", "놀이", "정보 공유", "101일된 아기입니다. 오늘 처음으로 새벽수유없이 5시반까지 쭉 자고 일어났는데, 평소보다 1시간반정도 일찍일어난거거든요\n그래서 그런지 낮잠을 엄청 자네요? ㅠㅠㅠ\n이런날도 있겠지 싶어서 애기 하는대로 두는중인데 어디 아픈건 아닌지 걱정도 살짝 되네용.. 열나거나 쳐지거나 이런거 아니면 둬도 될까유... ㅠㅠ", R.drawable.detail_image8));
        writings.add(new WritingItem("투잡을 위한 직장 재!택!근!무 알바, 이런 꿀 없어요~", "놀이", "정보 공유", "안녕하세요~!재택알바 재택근무 하실분!!\n재택가능.초보.주부.육아맘 가능합니다~\n업무내용 : 인터넷상품주문서 작성\n근무시간 : 조율가능\n자격조건 : 인터넷 사용가능한 자\n*미성년자 제외*\n급여 : 당일결제 일급 5만원이상 \n단순업무이며 초보자분들도 부담없이 참여하실수 있습니다.상품주문서 작성하고 주문확인만 하시면 되는 업무입니다.\n부담없이 PC나 휴대폰으로 참여가능해요~\n많은 지원과 문의 부탁드립니당~ \n카톡:en889\n", R.drawable.detail_image9));
        WritingAdapter writingAdapter = new WritingAdapter(writings);
        writingRv.setAdapter(writingAdapter);
    }
}