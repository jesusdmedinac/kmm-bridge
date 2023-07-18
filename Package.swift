// swift-tools-version:5.3
import PackageDescription

let remoteKotlinUrl = "https://maven.pkg.github.com/jesusdmedinac/kmm-bridge/io/jesusdmedinac/kmmapp/shared-kmmbridge/0.0.1/shared-kmmbridge-0.0.1.zip"
let remoteKotlinChecksum = "7275061f4f4c8961977b1a2c356f8c2525756319e7ca3964e2191a7683857ca8"
let packageName = "shared"

let package = Package(
    name: packageName,
    platforms: [
        .iOS(.v13)
    ],
    products: [
        .library(
            name: packageName,
            targets: [packageName]
        ),
    ],
    targets: [
        .binaryTarget(
            name: packageName,
            url: remoteKotlinUrl,
            checksum: remoteKotlinChecksum
        )
        ,
    ]
)