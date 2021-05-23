package org.mkl.serverb;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author mkl
 * @date 2021/5/23
 * @description
 */
public class ReactiveDome {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {

			@Override
			public void call(Subscriber<? super Integer> subscriber) {
				for (int i = 0; i < 5; i++) {
					subscriber.onNext(i);
				}
				subscriber.onCompleted();
			}

		});
		Observer<Integer> observer = new Observer<Integer>() {

			@Override
			public void onCompleted() {
				System.out.println("onCompleted");
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("onError");
			}

			@Override
			public void onNext(Integer item) {
				System.out.println("Item is " + item);
			}
		};


		Future<Integer> future = observable.toBlocking().toFuture();
		observable.subscribe(observer);
		System.out.println(future.get().toString());

	}
}
