package com.performance.module_2_217

class Feature217UseCase2(
    private val repository: Feature217Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
