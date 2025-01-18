# @svssdeva/video-data-bridge

Capacitor plugin for passing data from web to android

## Install

```bash
npm install @svssdeva/video-data-bridge
npx cap sync
```

## API

<docgen-index>

* [`openVideo(...)`](#openvideo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### openVideo(...)

```typescript
openVideo(videoData: VideoData) => Promise<{ success: boolean; }>
```

| Param           | Type                                            |
| --------------- | ----------------------------------------------- |
| **`videoData`** | <code><a href="#videodata">VideoData</a></code> |

**Returns:** <code>Promise&lt;{ success: boolean; }&gt;</code>

--------------------


### Interfaces


#### VideoData

| Prop             | Type                |
| ---------------- | ------------------- |
| **`token`**      | <code>string</code> |
| **`userId`**     | <code>string</code> |
| **`videoData`**  | <code>string</code> |
| **`clientId`**   | <code>string</code> |
| **`clientType`** | <code>string</code> |
| **`randomId`**   | <code>string</code> |

</docgen-api>
