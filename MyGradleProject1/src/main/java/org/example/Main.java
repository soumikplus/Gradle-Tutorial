package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws IOException{
        System.out.println("Hello OkHttp!");
//        OkHttpClient client = new OkHttpClient();
////        String url = "https://jsonplaceholder.typicode.com/todos/1";
//        String url = "https://example.com/";
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        try(Response response = client.newCall(request).execute()){
//            if(!response.isSuccessful()){
//                System.out.println("Something Went wrong!");
//            }
//            System.out.println(response.body().string());
//        }catch(IOException ex){
//            ex.printStackTrace();
//        }



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TodoService service = retrofit.create(TodoService.class);
        Todo t = service.getTodoById("4").execute().body();
        if(t != null) System.out.println("Todo object download is " + t.toString());


    }
}