import DELETE.DELETEMethod1;
import GET.GETMethod;
import PATCH.PATCHMethod;
import POST.POSTMethod;
import PUT.PUTMethod;
import org.testng.annotations.Test;

public class BaseTest {

   protected GETMethod get;
    protected POSTMethod post;
    protected PUTMethod put;
    protected PATCHMethod patch;
    protected DELETEMethod1 delete;

    @Test(priority = 1)
    void setGet(){
        get = new GETMethod();
        get.get();
    }

    @Test(priority = 2)
    void setPost(){
        post = new POSTMethod();
        post.post();
    }

    @Test(priority = 3)
    void setPut(){
        put = new PUTMethod();
        put.put();
    }

    @Test(priority = 4)
    void setPatch(){
        patch = new PATCHMethod();
        patch.patch();
    }

    @Test(priority = 5)
    void setDelete(){
        delete = new DELETEMethod1();
        delete.delete();
    }
}

