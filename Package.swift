// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "SvssdevaVideoDataBridge",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "SvssdevaVideoDataBridge",
            targets: ["VideoDataBridgePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "VideoDataBridgePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/VideoDataBridgePlugin"),
        .testTarget(
            name: "VideoDataBridgePluginTests",
            dependencies: ["VideoDataBridgePlugin"],
            path: "ios/Tests/VideoDataBridgePluginTests")
    ]
)