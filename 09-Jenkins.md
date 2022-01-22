# Jenkins

1. Start up Jenkins and open at **localhost:8080**

2. login (admin/admin)

3. install plugins.

   - Menu, Manage Jenkins / Manage Plugins.
   - search for gradle, either in installed or availables.

4. Configure Tools

   - Go to Menu Manage Jenkins / Global Tool Configuration.
     -You can JDK, here what we need is Gradle, click on Add Gradle.
     -Give it a name and the path, save.

5. Create a Job

- Menu **"New Item"**,
- Give it a name, "javawebappbuild" and set as
  freestyle project
- Add Description, or source code management (git),
- For now git no needed, Go to Build tab: **Add a build step**
- Select **Invoke Gradle script**, and select invoke Gradle, by using the one you created in configuration.
- Click on Advance, and set: Root Build Script for multi module, or Build file for specific one.
  -Set the path of your local app, e.g. /Users/gino/documents/project/gradleweb1
