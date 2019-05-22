package io.javabrains.springbootstarter;

import java.util.concurrent.CompletableFuture;

public class Sample {
    public static void main(String[] args) throws Exception
    {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(Sample::generate);

        future.thenAccept(System.out::println);
        System.out.println("In Main");
    }

    private static int generate(){
        System.out.println("doing work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2;
    }
}
