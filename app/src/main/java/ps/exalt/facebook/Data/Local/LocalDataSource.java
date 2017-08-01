package ps.exalt.facebook.Data.Local;

import java.util.List;

import io.reactivex.Observable;
import ps.exalt.facebook.Util.Network.API.Comment;
import ps.exalt.facebook.Util.Network.API.Post;
import ps.exalt.facebook.Util.Network.API.PostLike;
import ps.exalt.facebook.Util.Network.API.User;
import ps.exalt.facebook.Data.DataSource;

/**
 * Created by Sharif on 7/26/2017.
 */

public class LocalDataSource extends DataSource {
    private static LocalDataSource localDataSource;
    private List<Comment> comments;

    public static LocalDataSource getInstance() {
        if (localDataSource == null) {
            localDataSource = new LocalDataSource();
        }
        return localDataSource;
    }

    @Override
    public Observable<List<Comment>> getComments(long postId) {
        Observable<List<Comment>> commentsObservable = Observable.just(comments);
        return commentsObservable;
    }

    @Override
    public Observable<List<Post>> getPosts(int page) {
        return null;
    }

    @Override
    public Observable<List<User>> getUsers() {
        return null;
    }

    @Override
    public Observable<Post> postPost(String username, Post post) {
        return null;
    }

    @Override
    public Observable<PostLike> likePost(PostLike postLike) {
        return null;
    }

    @Override
    public Observable<Boolean> getToken(String username, String password) {
        return null;
    }
}
