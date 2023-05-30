package com.example.utsakbif_10120056.base;

//30 Mei 2023, 10120056, Chika Rizki Nuraulia, IF2
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
