package KBoy

import com.raylib.Jaylib.RAYWHITE
import com.raylib.Jaylib.VIOLET
import com.raylib.Raylib.*

class App {
    public fun run() {
        InitWindow(800, 450, "Demo")
        SetTargetFPS(60)
        var camera =  Camera3D()
                ._position( Vector3().x(18.0f).y(16.0f).z(18.0f))
                .target( Vector3())
                .up( Vector3().x(0.0f).y(1.0f).z(0.0f))
                .fovy(45.0f).projection(CAMERA_PERSPECTIVE)

        SetCameraMode(camera, CAMERA_ORBITAL)

        while (!WindowShouldClose()) {
            UpdateCamera(camera)
            BeginDrawing()
            ClearBackground(RAYWHITE)
            BeginMode3D(camera)
            DrawGrid(20, 1.0f)
            EndMode3D()
            DrawText("Hello world", 190, 200, 20, VIOLET)
            DrawFPS(20, 20)
            EndDrawing()
        }
        CloseWindow()
    }
}

fun main(args: Array<String>){
    var app = App()
    app.run()
}
