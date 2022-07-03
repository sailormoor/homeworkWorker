public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    int e = 33;

    public void error() {
        errorCallback.onError("Task " + e + " ended with error");
    }

    public void start() {
        for (int i = 1; i <= 100; i++) {
            if (i == e) {
                i++;
            }
            callback.onDone("Task " + i + " is done");

        }
    }


}
