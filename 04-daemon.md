## Daemon

---

This command will kick off the deamon process. When build happens, it'll load all the information, do all the required calculations for build the project. Along with that, it'll start off a background process, then the subsequent builds will be much faster.(Not doing all calculation again because the deamon will have all that information)

```sh
$gradle clean
$gradle build --daemon
$gradle build
```

In a Jenkins Server, where we have all the builds for our running projects, we can run gradle daemon on it and the first build it take a long, however, the second build onwards, a lot of things are stored in memory and it'll take much lesser time.

If you dont want to use the daemon, which is running in background for a particular build:

```sh
$gradle build --no-daemon
```
