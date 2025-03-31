package com.performance.module_2_217

class Feature217UseCase0(
    private val repository: Feature217Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
