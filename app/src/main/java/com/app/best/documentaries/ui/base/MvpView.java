package com.app.best.documentaries.ui.base;

/**
 * Created by agrim on 4/7/17.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void showMessage(String message);

    void showError(String message);
}
