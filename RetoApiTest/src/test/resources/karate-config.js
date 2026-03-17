function fn() {
  var env = karate.env || 'dev';
  karate.log('karate.env =', env);

  var config = {
    rickandmortyUrl: 'https://rickandmortyapi.com',
    characterPath: '/api/character/',

    petsUrl: 'https://petstore.swagger.io/v2'
  };

  if (env === 'dev') {
    config.baseUrl = 'https://rickandmortyapi.com';
  } else if (env === 'qa') {
    config.baseUrl = 'https://rickandmortyapi.com';
  } else if (env === 'prod') {
    config.baseUrl = 'https://rickandmortyapi.com';
  }

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('logPrettyRequest', true);
  karate.configure('logPrettyResponse', true);

  return config;
}