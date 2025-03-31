package com.performance.module_3_183

class Feature183UseCase0(
    private val repository: Feature183Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
