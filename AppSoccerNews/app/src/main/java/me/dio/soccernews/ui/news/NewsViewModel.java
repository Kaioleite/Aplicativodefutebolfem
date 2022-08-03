package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Feroviária Tem Destaque Importante","é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado "));
        news.add(new News("Ferrinha Joga No Sábado","é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado "));
        news.add(new News("Copa do Mundo Feminina está terminando","é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }

}