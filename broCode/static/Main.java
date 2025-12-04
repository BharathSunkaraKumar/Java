class Friend {
    static int friendsCount;
    String name;

    Friend(String name) {
        this.name = name;
        friendsCount++;
    }

    static void addFriend() {
        System.out.println(friendsCount);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Static keyword");
        Friend friend1 = new Friend("mr.white");
        Friend friend2 = new Friend("jesse pinkman");
        Friend friend3 = new Friend("mike");
        // friend1.addFriend();
        // friend1.friendsCount;
        // friend2.addFriend();
        Friend.addFriend();
    }
}
