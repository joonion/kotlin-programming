import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

fun main() {
    Flowable
        .fromCallable { 
            Thread.sleep(1000) 
            "Done"
        }
        .subscribeOn(Schedulers.io())
        .observeOn(Schedulers.single())
        .subscribe(::println, Throwable::printStackTrace)
}

