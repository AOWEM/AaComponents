package com.example.aac.data.fragment.list.custom;

import com.aac.expansion.custom.AacCustomLFragmentPresenter;
import com.example.aac.model.TestDataViewModel;

/**
 * Created by yangc on 2017/8/15.
 * E-Mail:yangchaojiang@outlook.com
 * Deprecated:
 */

public class TestCustomFragmentPresenter extends AacCustomLFragmentPresenter<TestCustomListFragment, String> {
    public static final String TAG = "TestFragmentPresenter";
    private TestDataViewModel viewModel;

    @Override
    protected void onCreateView() {
        super.onCreateView();
        viewModel = getViewModel(TestDataViewModel.class);
    }

    @Override
    protected void lazyLoad() {
        viewModel.getListData(1).observe(getView(), getDataSubscriber());
    }

    @Override
    public void setLoadData(int pager) {
        viewModel.getListData(pager).observe(getView(), getDataSubscriber());
    }
}
