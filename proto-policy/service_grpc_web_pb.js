/**
 * @fileoverview gRPC-Web generated client stub for rocks.mango.proto.api
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var proto$policy_entity_pb = require('../proto-policy/entity_pb.js')
const proto = {};
proto.rocks = {};
proto.rocks.mango = {};
proto.rocks.mango.proto = {};
proto.rocks.mango.proto.api = require('./service_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.rocks.mango.proto.api.PolicyServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.rocks.mango.proto.api.PolicyServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!proto.rocks.mango.proto.api.PolicyServiceClient} The delegate callback based client
   */
  this.delegateClient_ = new proto.rocks.mango.proto.api.PolicyServiceClient(
      hostname, credentials, options);

};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.rocks.mango.proto.api.PCreatePolicyRequest,
 *   !proto.rocks.mango.proto.api.PCreatePolicyResponse>}
 */
const methodInfo_PolicyService_createPolicy = new grpc.web.AbstractClientBase.MethodInfo(
  proto.rocks.mango.proto.api.PCreatePolicyResponse,
  /** @param {!proto.rocks.mango.proto.api.PCreatePolicyRequest} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.rocks.mango.proto.api.PCreatePolicyResponse.deserializeBinary
);


/**
 * @param {!proto.rocks.mango.proto.api.PCreatePolicyRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.rocks.mango.proto.api.PCreatePolicyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.rocks.mango.proto.api.PCreatePolicyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServiceClient.prototype.createPolicy =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/rocks.mango.proto.api.PolicyService/createPolicy',
      request,
      metadata,
      methodInfo_PolicyService_createPolicy,
      callback);
};


/**
 * @param {!proto.rocks.mango.proto.api.PCreatePolicyRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.rocks.mango.proto.api.PCreatePolicyResponse>}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServicePromiseClient.prototype.createPolicy =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.createPolicy(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.rocks.mango.proto.api.PUpdateLimitsRequest,
 *   !proto.rocks.mango.proto.api.PUpdateLimitsResponse>}
 */
const methodInfo_PolicyService_updateLimits = new grpc.web.AbstractClientBase.MethodInfo(
  proto.rocks.mango.proto.api.PUpdateLimitsResponse,
  /** @param {!proto.rocks.mango.proto.api.PUpdateLimitsRequest} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.rocks.mango.proto.api.PUpdateLimitsResponse.deserializeBinary
);


/**
 * @param {!proto.rocks.mango.proto.api.PUpdateLimitsRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.rocks.mango.proto.api.PUpdateLimitsResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.rocks.mango.proto.api.PUpdateLimitsResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServiceClient.prototype.updateLimits =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/rocks.mango.proto.api.PolicyService/updateLimits',
      request,
      metadata,
      methodInfo_PolicyService_updateLimits,
      callback);
};


/**
 * @param {!proto.rocks.mango.proto.api.PUpdateLimitsRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.rocks.mango.proto.api.PUpdateLimitsResponse>}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServicePromiseClient.prototype.updateLimits =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.updateLimits(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.rocks.mango.proto.api.PAssignPolicyRequest,
 *   !proto.rocks.mango.proto.api.PAssignPolicyResponse>}
 */
const methodInfo_PolicyService_assignPolicy = new grpc.web.AbstractClientBase.MethodInfo(
  proto.rocks.mango.proto.api.PAssignPolicyResponse,
  /** @param {!proto.rocks.mango.proto.api.PAssignPolicyRequest} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.rocks.mango.proto.api.PAssignPolicyResponse.deserializeBinary
);


/**
 * @param {!proto.rocks.mango.proto.api.PAssignPolicyRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.rocks.mango.proto.api.PAssignPolicyResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.rocks.mango.proto.api.PAssignPolicyResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServiceClient.prototype.assignPolicy =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/rocks.mango.proto.api.PolicyService/assignPolicy',
      request,
      metadata,
      methodInfo_PolicyService_assignPolicy,
      callback);
};


/**
 * @param {!proto.rocks.mango.proto.api.PAssignPolicyRequest} request The
 *     request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.rocks.mango.proto.api.PAssignPolicyResponse>}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServicePromiseClient.prototype.assignPolicy =
    function(request, metadata) {
  return new Promise((resolve, reject) => {
    this.delegateClient_.assignPolicy(
      request, metadata, (error, response) => {
        error ? reject(error) : resolve(response);
      });
  });
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.rocks.mango.proto.api.PGetPolicyRequest,
 *   !proto.rocks.mango.proto.api.PGetPolicyResponse>}
 */
const methodInfo_PolicyService_getPolicyStream = new grpc.web.AbstractClientBase.MethodInfo(
  proto.rocks.mango.proto.api.PGetPolicyResponse,
  /** @param {!proto.rocks.mango.proto.api.PGetPolicyRequest} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.rocks.mango.proto.api.PGetPolicyResponse.deserializeBinary
);


/**
 * @param {!proto.rocks.mango.proto.api.PGetPolicyRequest} request The request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.rocks.mango.proto.api.PGetPolicyResponse>}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServiceClient.prototype.getPolicyStream =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/rocks.mango.proto.api.PolicyService/getPolicyStream',
      request,
      metadata,
      methodInfo_PolicyService_getPolicyStream);
};


/**
 * @param {!proto.rocks.mango.proto.api.PGetPolicyRequest} request The request proto
 * @param {!Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.rocks.mango.proto.api.PGetPolicyResponse>}
 *     The XHR Node Readable Stream
 */
proto.rocks.mango.proto.api.PolicyServicePromiseClient.prototype.getPolicyStream =
    function(request, metadata) {
  return this.delegateClient_.client_.serverStreaming(this.delegateClient_.hostname_ +
      '/rocks.mango.proto.api.PolicyService/getPolicyStream',
      request,
      metadata,
      methodInfo_PolicyService_getPolicyStream);
};


module.exports = proto.rocks.mango.proto.api;

