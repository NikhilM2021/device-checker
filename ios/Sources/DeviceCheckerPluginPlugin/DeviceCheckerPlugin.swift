import Foundation

@objc public class DeviceCheckerPlugin: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
