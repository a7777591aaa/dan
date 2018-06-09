package cn.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.runnable.LiftOff;

public class SingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
