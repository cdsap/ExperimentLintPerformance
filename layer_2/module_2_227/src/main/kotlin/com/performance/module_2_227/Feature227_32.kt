package com.performance.module_2_227

class Feature227UseCase0(
    private val repository: Feature227Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
