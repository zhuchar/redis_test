## Use redisTemplate directly
### Option 1: opsForHash
GATEWAYSSOKEY,ssokey1
GATEWAYSSOKEY,ssokey2
GATEWAYSSOKEY,ssokey3

#### NOTE: it seems not support ttl on hashkey(sub-key) level

### Option 2: opsForValue (with some naming convention)
GATEWAYSSOKEY_ssokey1
GATEWAYSSOKEY_ssokey2
GATEWAYSSOKEY_ssokey3

#### NOTE: ttl works on key level

## How to test
1. docker-compose up -d
2. Run test
3. Use redis-cli or redis-commander UI(http://localhost:8091/) to verify Redis data
