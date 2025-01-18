import Foundation

@objc public class VideoDataBridge: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
